public class ma
{
	public String str = new String(new char[505]);
	public int f;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		ma[] stu = tangible.Arrays.initializeWithDefaultmaInstances(505);
		ma temp = new ma();
		String str1 = new String(new char[505]);
		int i;
		int j = 0;
		int m = 0;
		int a;
		int b = 0;
		int n;
		int l;
		int k;
		int t;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str1 = new Scanner(System.in).nextLine();
		l = str1.length();
		for (i = 0;i <= l - n;i++)
		{
			stu[i].f = 0;
			for (j = i,k = 0;j < i + n;j++,k++)
			{
				stu[i].str = tangible.StringFunctions.changeCharacter(stu[i].str, k, str1.charAt(j));
			}
			stu[i].str = tangible.StringFunctions.changeCharacter(stu[i].str, n, '\0');
			for (t = 0;t < i;t++)
			{
				if (strcmp(stu[t].str,stu[i].str) == 0)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
			for (a = 0;a < l;a++)
			{
			if (str1.charAt(a) == stu[i].str.charAt(b))
			{
			   b = b + 1;
			}
			else
			{
				if (b != 0)
				{
					a = a - 1;
				}
				b = 0;
			}
			if (b == n)
			{
			stu[i].f++;
			b = 0;
			a = a - n + 1;
			}
			}
			}
		b = 0;
		flag = 0;
		}
		for (j = 1;j < l - n + 1;j++)
		{
			for (i = 0;i < l - n + 1 - j;i++)
			{
				if (stu[i].f < stu[i + 1].f)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
					temp.copyFrom(stu[i]);
					stu[i] = stu[i + 1];
					stu[i + 1] = temp;
				}
			}
		}
	  if (stu[0].f == 1)
	  {
		  System.out.print("NO");
	  }
	  else
	  {
		System.out.printf("%d\n",stu[0].f);
		System.out.printf("%s",stu[0].str);
			for (j = 1;j < l - n + 1;j++)
			{
				if (stu[j].f == stu[0].f)
				{
					System.out.printf("\n%s",stu[j].str);
				}
				else
				{
					break;
				}
			}
	  }



		return 0;
	}

}

