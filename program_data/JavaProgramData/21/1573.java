public class point
{
	public int num;
	public float distance;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		point[] ans = tangible.Arrays.initializeWithDefaultpointInstances(300);
		float ave;
		int n;
		int i;
		int s = 0;
		int j;
		point temp = new point();
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s = a[i] + s;
		}
		ave = (s * 1.0) / n;
		for (i = 1;i <= n;i++)
		{
			ans[i].num = a[i];
			if (ave > a[i])
			{
				ans[i].distance = ave - a[i];
			}
			else
			{
				ans[i].distance = a[i] - ave;
			}
		}
		for (i = n - 1;i >= 1;i--)
		{
			for (j = 1;j <= i;j++)
			{
				if (ans[j].distance < ans[j + 1].distance)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=ans[j];
					temp.copyFrom(ans[j]);
					ans[j] = ans[j + 1];
					ans[j + 1] = temp;
				}
			}
		}
		System.out.printf("%d",ans[1].num);
		for (i = 2;i <= n;i++)
		{
			if (ans[i].distance == ans[1].distance)
			{
				System.out.printf(",%d",ans[i].num);
			}
		}
		return 0;
	}
}

