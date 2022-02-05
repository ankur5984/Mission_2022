package com.app.exercise2;

public class PaintJob {

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}

		// area of wall /areaPerBucket - extraBuckets === bucket count
		return (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);

	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0)
			return -1;
		return (int) Math.ceil(width * height / areaPerBucket);
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0)
			return -1;
		return (int) Math.ceil(area / areaPerBucket);
	}

	public static void main(String[] args) {

	}

}
