package edu.berliner.myrobotinterview.Repositories;

import edu.berliner.myrobotinterview.Models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long>
{
}
