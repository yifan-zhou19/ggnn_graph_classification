public class book
{
		public int mun;
		public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] a = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
			int n;
			int i;
			int j;
			int l;
			int q = 0;
			char k;
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
						a[i].mun = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						a[i].name = tempVar3.charAt(0);
					}
			}
			int[] w = new int[26];
			for (i = 0;i < n;i++)
			{
					l = String.valueOf(a[i].name).length();
					for (j = 0;j < l;j++)
					{
							k = a[i].name.charAt(j);
							w[k - 65]++;
							/*for(k='A';k<='Z';k++)
							{
							        if(a[i].name[j]==k)
							        {
							                q=k-65;
							                w[q]++;
							        }
							}*/
					}
			}
			int max;
			max = w[0];
			int flag = 0;
			for (i = 0;i < 26;i++)
			{
					if (w[i] > max)
					{
						max = w[i];
						flag = i;
					}
			}
			System.out.printf("%c\n",flag + 65);
			System.out.printf("%d\n",w[flag]);
			for (i = 0;i < n;i++)
			{
					l = String.valueOf(a[i].name).length();
					for (j = 0;j < l;j++)
					{
					if (a[i].name.charAt(j) == (flag + 65))
					{
							System.out.printf("%d\n",a[i].mun);
					}
					}
			}
			return 0;
	}

}

