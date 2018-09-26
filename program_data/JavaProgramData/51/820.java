public class zimu
{
	   public String a = new String(new char[6]);
	   public int b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		zimu[] r = tangible.Arrays.initializeWithDefaultzimuInstances(501);
		zimu temp = new zimu();
		final String s = "";
		int n;
		int k;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		k = s.length();
		for (i = 0;i < k + n - 1;i++)
		{
							for (j = 0;j < 6;j++)
							{
							   r[i].a = r[i].a.substring(0, j);
							}
							r[i].b = 0;
		}
		for (i = 0;i < k - n + 1;i++)
		{
							for (p = 0,j = i;j < i + n;j++,p++)
							{
											  r[i].a = tangible.StringFunctions.changeCharacter(r[i].a, p, s.charAt(j));
							}
		}
		for (i = 0;i < k - n + 1;i++)
		{
							for (j = i;j < k - n + 1;j++)
							{
												if (strcmp(r[j].a,r[i].a) == 0)
												{
																			r[i].b = r[i].b + 1;
												}
							}
		}
		for (i = 1;i < k - n + 1;i++)
		{
							for (j = 0;j < k - n + 1 - i;j++)
							{
												  if (r[j].b < r[j + 1].b)
												  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=r[j];
																   temp.copyFrom(r[j]);
																   r[j] = r[j + 1];
																   r[j + 1] = temp;
												  }
							}
		}
		if (r[0].b > 1)
		{
		System.out.printf("%d\n",r[0].b);
		for (i = 0;i < k + n - 1;i++)
		{
							if (r[i].b == r[0].b)
							{
											  System.out.printf("%s\n",r[i].a);
							}
		}
		}
		else
		{
		System.out.print("NO");
		}


		return 0;
	}


}

