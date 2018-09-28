public class District
{
		public int x;
		public int y;
		public int z;
}
public class Distance
{
		public int a;
		public int b;
		public double c;
}

package <missing>;

public class GlobalMembers
{
		public static District[] dis = tangible.Arrays.initializeWithDefaultDistrictInstances(11); //????
		public static Distance[] d = tangible.Arrays.initializeWithDefaultDistanceInstances(91); //?????????
		public static Distance temp = new Distance();
	public static int Main()
	{
		int n;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i <= n;i++)
		{
			dis[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dis[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dis[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i < n;i++)
		{
			for (int j = i + 1;j <= n;j++)
			{
				d[k].a = i;
				d[k].b = j;
				d[k].c = Math.sqrt((double)(dis[i].x - dis[j].x) * (dis[i].x - dis[j].x) + (dis[i].y - dis[j].y) * (dis[i].y - dis[j].y) + (dis[i].z - dis[j].z) * (dis[i].z - dis[j].z));
				k++;
			}
		} //?i????j?????
		for (int i = 1;i <= k - 2;i++)
		{
			for (int j = 1;j <= k - i;j++)
			{
				if (d[j].c < d[j + 1].c)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
				temp.copyFrom(d[j]);
				d[j] = d[j + 1];
				d[j + 1] = temp;
				}
			}
		} //??????
		for (int i = 1;i <= k - 1;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dis[d[i].a].x,dis[d[i].a].y,dis[d[i].a].z,dis[d[i].b].x,dis[d[i].b].y,dis[d[i].b].z,d[i].c);
		} //??

		return 0;
	}

}

