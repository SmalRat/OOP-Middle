package ua.edu.ucu.OOPMiddle.domens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomenService {

    private final DomenRepository domenRepository;

    @Autowired
    public DomenService(DomenRepository domenRepository) {
        this.domenRepository = domenRepository;
    }

    public List<Domen> getDomens() {
        return domenRepository.findAll();
    }

    public void addNewDomen(Domen domen) {
        Optional<Domen> domenOptioanl = domenRepository
                .findDomenByName(domen.getName());
        if (domenOptioanl.isPresent()) {
            throw new IllegalStateException("name already exist");
        }
        domenRepository.save(domen);
//        System.out.println(domen);
    }

    public void deleteDomen(Long domenId) {
        boolean exists = domenRepository.existsById(domenId);
        if (!exists) {
            throw new IllegalStateException("domen with Id " + domenId + " does not exist");
        }
        domenRepository.deleteById(domenId);
    }
}
