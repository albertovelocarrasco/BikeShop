/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */package com.mycompany.bicycleshop.Backend.Service.Part;import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;import com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule.PriceRule;import com.mycompany.bicycleshop.Backend.Persistence.Repositories.ConstraintRepository;import com.mycompany.bicycleshop.Backend.Persistence.Repositories.PartRepository;import com.mycompany.bicycleshop.Backend.Persistence.Repositories.PricingRuleRepository;import java.util.List;/** * * @author arbe */public class PartServiceImpl implements PartService {        private PartRepository partRepository;    private ConstraintRepository constraintRepository;    private PricingRuleRepository pricingRuleRepository;    public PartServiceImpl(PartRepository partRepository, ConstraintRepository constraintRepository, PricingRuleRepository pricingRuleRepository) {        this.partRepository = partRepository;        this.constraintRepository = constraintRepository;        this.pricingRuleRepository = pricingRuleRepository;    }      @Override    public Part getPart(Long id) {        return partRepository.getByID(id);    }    @Override    public void addPriceRules(List<PriceRule> priceRules) {        pricingRuleRepository.store(priceRules);    }    @Override    public List<Part> getParts() {        return partRepository.getAll();    }    @Override    public void createPart(Part part) {        partRepository.store(part);    }    @Override    public void addConstraints(List<Constraint> constraints) {        constraintRepository.store(constraints);    }    }