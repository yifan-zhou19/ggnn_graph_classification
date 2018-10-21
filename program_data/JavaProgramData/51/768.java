package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int max;
		int n;
		int p;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;
		int[][] a = new int[510][5];
		int[] num = new int[510];
		String str = new String(new char[510]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		len = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i1 = 0;i1 <= len - n;i1++)
		{
			for (i2 = 0;i2 <= n - 1;i2++)
			{
				a[i1][i2] = str.charAt(i1 + i2);
			}
		}
		for (i3 = 0;i3 <= len - n;i3++)
		{
			for (i4 = i3 + 1;i4 <= len - n;i4++)
			{
				if ((a[i3][0] == a[i4][0]) && (a[i3][1] == a[i4][1]) && (a[i3][2] == a[i4][2]) && (a[i3][3] == a[i4][3]) && (a[i3][4] == a[i4][4]))
				{
				num[i3]++;
				}
			}
		}
		max = num[0];
		for (i5 = 1;i5 <= len - n;i5++)
		{
			if (num[i5] > max)
			{
			  max = num[i5];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			  p = max + 1;
	System.out.printf("%d\n",p);
			for (i6 = 0;i6 <= len - n;i6++)
			{
			 if (num[i6] == max)
			 {
				 for (i7 = 0;i7 <= n - 1;i7++)
				 {
					 if (i7 == n - 1)
					 {
						 System.out.printf("%c\n",str.charAt(i6 + i7));
					 }
					 else
					 {
						 System.out.printf("%c",str.charAt(i6 + i7));
					 }
				 }
			 }
			}
		}

	}


}

