public class zimu
{
	public char a;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static zimu[] B = tangible.Arrays.initializeWithDefaultzimuInstances(300);
	public static zimu temp = new zimu();
	public static int Main()
	{
		String A = new String(new char[303]);
		int i;
		int j = 0;
		int k;
		int number;
		int flag;
		int flag1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = tempVar.charAt(0);
		}
		number = A.length();
		for (i = 0;i < number;i++)
		{
			B[i].n = 0;
		}
		for (i = 0;i < number;i++)
		{
			if ((A.charAt(i) >= 65 && A.charAt(i) <= 90) || (A.charAt(i) >= 97 && A.charAt(i) <= 122))
			{
				flag1 = 1;
			flag = 0;
			if (i == 0)
			{
				B[j].a = A.charAt(i);
				B[j].n = 1;
				j++;
			}
			else
			{
				for (k = 0;k < j;k++)
				{
					if (B[k].a == A.charAt(i))
					{
						B[k].n++;
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					B[j].a = A.charAt(i);
					B[j].n = 1;
					j++;
				}
			}
			}
		}
		if (flag1 == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i < j;i++)
		{
			for (k = 0;k < j - i;k++)
			{
				if (B[k].a > B[k + 1].a)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=B[k+1];
					temp.copyFrom(B[k + 1]);
					B[k + 1] = B[k];
					B[k] = temp;
				}
			}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%c=%d\n",B[i].a,B[i].n);
		}
		}
		return 0;
	}
}

