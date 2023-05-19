import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getByName(String name) {
        return publisherRepository.findByName(name);
    }

    public Optional<Publisher> getById(Long id) {
        return publisherRepository.findById(id);
    }

    public List<Publisher> getByActiveTrue() {
        return publisherRepository.findByActiveTrue();
    }

    public List<Publisher> getByNameAndActiveTrue(String name) {
        return publisherRepository.findByNameAndActiveTrue(name);
    }

    public List<Publisher> getByNameAndActiveFalse(String name) {
        return publisherRepository.findByNameAndActiveFalse(name);
    }

    public List<Publisher> getByNameAndActive(String name, boolean active) {
        return publisherRepository.findByNameAndActive(name, active);
    }

    public List<Publisher> getByActive(boolean active) {
        return publisherRepository.findByActive(active);
    }

    public void editPublisher(Long id, String name, boolean active) {
        publisherRepository.updatePublisher(id, name, active);
    }

    public void deletePublisher(Long id) {
        publisherRepository.deletePublisher(id);
    }

    public void downloadBranchesAsCsvFile(){
        // TODO: Implement method
    }

    public void submit(){
        // TODO: Implement method
    }

    public void reset(){
        // TODO: Implement method
    }

}