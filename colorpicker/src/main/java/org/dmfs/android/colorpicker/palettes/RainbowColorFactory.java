/*
 * Copyright 2017 dmfs GmbH
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.android.colorpicker.palettes;

import android.graphics.Color;


/**
 * A factory that returns the entire palette with a specific saturation and lightness value.
 *
 * @author Marten Gajda
 */
public final class RainbowColorFactory implements ColorFactory
{
    private final float[] mHSL = new float[] { 0, 0, 0 };


    public RainbowColorFactory(float saturation, float lightness)
    {
        mHSL[1] = saturation;
        mHSL[2] = lightness;
    }


    @Override
    public int colorAt(int index, int count)
    {
        count += 1;
        float[] hsl = mHSL;

        hsl[0] = index * 360f / count;

        return Color.HSVToColor(255, hsl);
    }
}
