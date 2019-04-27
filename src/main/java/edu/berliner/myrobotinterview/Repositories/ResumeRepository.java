package edu.berliner.myrobotinterview.Repositories;

import edu.berliner.myrobotinterview.Models.Resume;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Long>
{
}
