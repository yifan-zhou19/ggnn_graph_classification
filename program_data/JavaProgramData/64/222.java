/**
 *@ file    1000012834_005homework.cpp
 *@ author  ???
 *@ date    2010-12-15
 *@ description 
 *          ???????????
 */
public class position // ??????????????????
{
	public double[] distance = new double[1000];
	public int x;
	public int y;
	public int z;

}
public class str // ???????????????????
{
	public int point1;
	public int point2;
	public double distance;
}

package <missing>;

public class GlobalMembers
{
	public static position[] pos = tangible.Arrays.initializeWithDefaultpositionInstances(1000); // ?????????????pos
	public static str[] length = tangible.Arrays.initializeWithDefaultstrInstances(100); // length?????????,temp???????
	public static str temp = new str();
	public static int Main()
	{

		// ??????n,????i,j?????k,??????????num,???????????????
		int n;
		int i;
		int j;
		int k;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			pos[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pos[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pos[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = 0; // ?????
		for (i = 1; i <= n; i++) // ???????????????????length??
		{
			k = 0; // ???????1????????????????
			for (j = i + 1; j <= n; j++)
			{
				k++; // ??????
				num++; // ??????????+1

				// ????????????
				pos[i].distance[k] = (pos[i].x - pos[j].x) * (pos[i].x - pos[j].x) + (pos[i].y - pos[j].y) * (pos[i].y - pos[j].y) + (pos[i].z - pos[j].z) * (pos[i].z - pos[j].z);

				// ????????????length??
				length[num].point1 = i;
				length[num].point2 = j;
				length[num].distance = pos[i].distance[k];
			}
		}

		// ??????????????????
		for (i = 1; i < num; i++)
		{
			for (j = 1; j <= num - i; j++)
			{
				if (length[j].distance < length[j + 1].distance)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = length[j];
					temp.copyFrom(length[j]);
					length[j] = length[j + 1];
					length[j + 1] = temp;
				}
			}
		}

		// ????????????
		for (i = 1; i <= num; i++)
		{
			System.out.print("(");
			System.out.print(pos[length[i].point1].x);
			System.out.print(",");
			System.out.print(pos[length[i].point1].y);
			System.out.print(",");
			System.out.print(pos[length[i].point1].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(pos[length[i].point2].x);
			System.out.print(",");
			System.out.print(pos[length[i].point2].y);
			System.out.print(",");
			System.out.print(pos[length[i].point2].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", Math.sqrt(length[i].distance));
			System.out.printf("%.2f", "\n");
		}

		return 0;
	}
}

