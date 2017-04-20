package XO.controllers;

import XO.model.Field;
import XO.model.Figure;
import XO.model.exceptions.AlreadyOccupiedException;
import XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure ) throws InvalidPointException,
                                                         AlreadyOccupiedException{
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point,figure);
    }
}
