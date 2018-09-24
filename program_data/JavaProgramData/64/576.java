/*
 * fuck.cpp
 *
 *  Created on: 2011-12-16
 *      Author: guan hong wei
 */
public class locations //????,????
{
public int x;
public int y;
public int z;
}
public class distances //?????????
{
public int i;
public int j;
public double distance;
}

package <missing>;

public class GlobalMembers
{
	public static locations[] locations = tangible.Arrays.initializeWithDefaultlocationsInstances(100);
	public static distances[] distances = tangible.Arrays.initializeWithDefaultdistancesInstances(100);
	public static distances m = new distances();
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	locations[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	locations[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	locations[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	distances[t].i = i;
	distances[t].j = j;
	distances[t].distance = Math.sqrt((double)(Math.pow(locations[i].x - locations[j].x,2.0) + Math.pow(locations[i].y - locations[j].y,2.0) + Math.pow(locations[i].z - locations[j].z,2.0))); //????
	t++;
	}
	}
	for (i = 0;i < t;i++) //???????????
	{
	for (j = t - 1;j > i;j--)
	{
	if (distances[j].distance > distances[j - 1].distance)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: m=distances[j];
	m.copyFrom(distances[j]);
	distances[j] = distances[j - 1];
	distances[j - 1] = m;
	}
	}
	}
	for (i = 0;i < t;i++)
	{
	System.out.print('(');
	System.out.print(locations[distances[i].i].x);
	System.out.print(',');
	System.out.print(locations[distances[i].i].y);
	System.out.print(',');
	System.out.print(locations[distances[i].i].z);
	System.out.print(')');
	System.out.print('-');
	System.out.print('(');
	System.out.print(locations[distances[i].j].x);
	System.out.print(',');
	System.out.print(locations[distances[i].j].y);
	System.out.print(',');
	System.out.print(locations[distances[i].j].z);
	System.out.print(")=");
	System.out.printf("%.2f", distances[i].distance);
	System.out.printf("%.2f", "\n");
	}
	return 0;
	}

}

