package demo;

import java.util.ArrayList;
import java.util.List;

import kMeans.KMeans;
import kMeans.Sample;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMeans kMeans = new KMeans();
		kMeans.loadTextFile("testData.txt");
		List<Sample> centroids = new ArrayList<Sample>();
		centroids.add(new Sample(3, 3, 3));
		centroids.add(new Sample(5, 5, 5));
		centroids.add(new Sample(7, 7, 7));
		kMeans.setCentroids(centroids);
		kMeans.start();
	}

}
