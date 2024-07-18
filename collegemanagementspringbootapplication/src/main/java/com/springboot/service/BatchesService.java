package com.springboot.service;

import com.springboot.entity.Batches;

public interface BatchesService 
{
	// save teacher details in db table
			Batches addBatches(Batches batches);
			
			// method to fetch teacher detail based on tid from db table
			Batches getBatchesDetail(int cid);
			
			//method to modify teacher detail based on tid from db table
			Batches updateBatchesDetail(Batches batches, int bid);
			
			//method to remove teacher detail based on tid from db table
			void deleteBatchesDetail(int bid);
}
