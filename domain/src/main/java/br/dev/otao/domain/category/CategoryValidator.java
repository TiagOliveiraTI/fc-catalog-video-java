package br.dev.otao.domain.category;

import br.dev.otao.domain.validation.Error;
import br.dev.otao.domain.validation.ValidationHandler;
import br.dev.otao.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    protected CategoryValidator(final Category acategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = acategory;
    }

    @Override
    public void validate() {
        if(this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
