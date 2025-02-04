package com.cognizant.mfpe.pensionManagementSystem.webportal.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.mfpe.pensionManagementSystem.webportal.model.Pensioner;

@FeignClient(name = "pensioner-detail-service", url = "http://localhost:9092")
public interface PensionerDetailClient {

	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public Pensioner getPensionerDetailByAadhaar(@RequestHeader("Authorization") String token,
			@PathVariable(value = "aadhaarNumber") long aadhaarNumber);

}
