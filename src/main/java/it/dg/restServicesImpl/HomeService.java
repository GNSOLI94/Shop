package it.dg.restServicesImpl;


import static org.imgscalr.Scalr.resize;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import org.springframework.stereotype.Service;

import restServicesInterfaces.HomeServiceInterface;


/*
 * In questa classe si va a sviluppare la logica del controller
 */

@Service
public class HomeService implements HomeServiceInterface {
	
	public byte[] createByteArrayFromThumb(File tmpImg, Integer photoSizeX, Integer photoSizeY) throws IOException {
		
		BufferedImage bufIn = createImageFromFile(tmpImg);
		BufferedImage bufOut = createThumbnail(bufIn, photoSizeX, photoSizeY);
		byte[] retVal = createByteStreamFromImage(bufOut);
		return retVal;
	}

	private BufferedImage createImageFromFile(File tmpImg) throws IOException {
		return ImageIO.read(tmpImg);
	}

	private static BufferedImage createThumbnail(BufferedImage img, Integer photoSizeX, Integer photoSizeY) {
		BufferedImage out = resize(img, Method.SPEED, Scalr.Mode.FIT_TO_WIDTH, photoSizeX, photoSizeY, Scalr.OP_ANTIALIAS);
		return out;
	}
	
	private byte[] createByteStreamFromImage(BufferedImage bufOut) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(bufOut, "jpeg", baos);
		return baos.toByteArray();
	}

}
