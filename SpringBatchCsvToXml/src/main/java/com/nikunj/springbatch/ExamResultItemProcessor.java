package com.nikunj.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.nikunj.springbatch.model.ExamResult;

public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult> {

	public ExamResult process(ExamResult result) throws Exception {
		System.out.println("Processing result :" + result);

		/*
		 * Only return results which are more than 60%
		 * 
		 */
		if (result.getPercentage() < 60) {
			return null;
		}

		return result;
	}

}
