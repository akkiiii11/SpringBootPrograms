package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Batches;
import com.springboot.entity.Courses;
import com.springboot.exception.BatchesIdNotFoundException;
import com.springboot.exception.CoursesIdNotFoundException;
import com.springboot.repository.BatchesRepository;
import com.springboot.service.BatchesService;

@Service
public class BatchesServiceImpl implements BatchesService {

	@Autowired
	BatchesRepository batRepo;
	@Override
	public Batches addBatches(Batches batches) {
		return batRepo.save(batches);
	}

	@Override
	public Batches getBatchesDetail(int bid) {
		return batRepo.findById(bid).
				orElseThrow(()-> new BatchesIdNotFoundException("Batch id is not corrected"));
	}

	@Override
	public Batches updateBatchesDetail(Batches batches, int bid) {
		Batches UpdateBatches = batRepo.findById(bid).
				orElseThrow(()-> new BatchesIdNotFoundException("Batch id is not corrected"));
				// set new value
		//Student.setSphone(student.getSphone());
		UpdateBatches.setDuration(batches.getDuration());
		UpdateBatches.setEnddate(batches.getEnddate());
		batRepo.save(UpdateBatches);
		return UpdateBatches;
	}

	@Override
	public void deleteBatchesDetail(int bid) {
		Batches delBatches =batRepo.findById(bid).
				orElseThrow(()-> new BatchesIdNotFoundException("Batch id is not corrected"));
		batRepo.delete(delBatches);
		
	}

}
