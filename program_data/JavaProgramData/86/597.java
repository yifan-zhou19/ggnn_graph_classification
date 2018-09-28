/*???????*/
public class information
{
	public int t;
	public int[] s = new int[20];
}

package <missing>;

public class GlobalMembers
{
	public static information[] children = tangible.Arrays.initializeWithDefaultinformationInstances(N);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int p;
		int[] num = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		/*???????*/
		for (i = 0;i < n;i++)
		{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						children[i].t = Integer.parseInt(tempVar2);
					}
			for (j = 0;j < children[i].t;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					children[i].s[j] = Integer.parseInt(tempVar3);
				}
			}
		}
		/*????????????*/
		for (i = 0;i < n;i++)
		{
			p = children[i].t;
			if (p == 0)
			{
				num[i] = 60;
			}
			else
			{
				for (j = 0;j < p;)
				{
					if ((children[i].s[j] + 3 * j) < 57)
					{
						j++;
					}
					else
					{
						break;
					}
				}
					if ((children[i].s[j] + 3 * j) <= 60 && (children[i].s[j] + 3 * j>57))
					{
					num[i] = children[i].s[j];
					}
				else
				{
					num[i] = 60 - 3 * j;
				}
			}
		}

			for (i = 0;i < n;i++)
			{
			System.out.printf("%d\n",num[i]);
			}
	}

}

