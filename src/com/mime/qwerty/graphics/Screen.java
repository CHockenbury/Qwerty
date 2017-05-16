package com.mime.qwerty.graphics;

import java.util.Random;

import com.mime.qwerty.Game;

public class Screen extends Render {

	private Render test;
	private int WIDTH = 256;
	private int HEIGHT = 256;

	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();
		test = new Render(WIDTH, HEIGHT);
		int ne = 0;
		for (int i = 0; i < WIDTH * HEIGHT; i++) {

			//random.nextInt() * (random.nextInt(5) / 4);
			int radius = WIDTH / 2;
			int x1 = radius -1;
			int y1 = radius - 1;
			int x2 = i % WIDTH;
			int y2 = i / HEIGHT
			int distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y1-y2,2))
			if (distance <= radius) {
				ne = Math.abs(random.nextInt());
			}
			else
			{
				ne = 0;
			}
			test.pixels[i] = ne;
		}
	}

	public void render(Game game) {
		for (int i = 0; i < width * height; i++)
		{
			pixels[i] = 0;
		}
		for (int i = 0; i < 50; i++) {
			int anim  = (int) (Math.sin((game.time + i) % 1000.0 / 100) * 100);
			int anim2 = (int) (Math.cos((game.time + i) % 1000.0 / 100) * 100);
			draw(test, (width - 256) / 2 + anim, (height - 256) / 2 - + anim2);
		}
	}

}
