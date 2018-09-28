public class patient
{
	public String num = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] sick = tangible.Arrays.initializeWithDefaultpatientInstances(101);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int r;
		int s;
		s = 0;
		r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sick[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sick[i].age = Integer.parseInt(tempVar3);
			}
		}
		int[] old = new int[101];
		int[] young = new int[101];
		for (i = 0;i < n;i++)
		{
			if (sick[i].age >= 60)
			{
				for (j = 0;j <= s;j++)
				{
					if (sick[i].age > sick[old[j]].age || j == s)
					{
						if (j == s)
						{
							old[s] = i;
							s = s + 1;
							break;
						}
						else
						{
							for (k = s;k >= j;k--)
							{
								old[k + 1] = old[k];
							}
							old[j] = i;
							s = s + 1;
							break;
						}
					}
				}
			}
			else
			{
				young[r] = i;
				r = r + 1;
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%s\n",sick[old[i]].num);
		}
		for (i = 0;i < r;i++)
		{
			System.out.printf("%s\n",sick[young[i]].num);
		}

		return 0;
	}
}

