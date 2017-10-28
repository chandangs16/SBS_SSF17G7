package edu.asu.sbs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import edu.asu.sbs.model.Otp;

public class OtpDAO {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public Otp getOTPByCustomerIDAndType(int customerId, String type) {
		
		Otp otp = (Otp) getCurrentSession()
				.createQuery("from Otp where customerId = :customerId and type = :type and OTPExpiry >= NOW() ORDER BY id DESC")
				.setParameter("customerId", customerId)
				.setParameter("type", type)
				.setMaxResults(1)
				.uniqueResult();
		
		return otp;
	}
	
	public Otp getOTPByID(String otpID) {
		
		try {
			return (Otp) getCurrentSession().get(Otp.class, Integer.valueOf(otpID));
		} catch (Exception e) {
			return null;
		}
		
	}

}
