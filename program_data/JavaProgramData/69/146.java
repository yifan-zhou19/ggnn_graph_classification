package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		//int temp = 0;
		String temp = new String(new char[252]);
		int[] a = new int[252];
		int[] b = new int[252];
		int[] ans = new int[252];
		int j1 = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			temp = tempVar.charAt(0);
		}
		for (int i = temp.length() - 1;i >= 0;i--)
		{
			a[j1++] = temp.charAt(i) - '0';
		}
		int j2 = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			temp = tempVar2.charAt(0);
		}
		for (int i = temp.length() - 1;i >= 0;i--)
		{
			b[j2++] = temp.charAt(i) - '0';
		}
		int j = Math.max(j1,j2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < j;i++)
		{
			ans[i] += a[i] + b[i];
			ans[i + 1] += ans[i] / 10;
			ans[i] %= 10;
		}
		int key = 0;
		int tag = 0;
		for (int i = j;i >= 0;i--)
		{
			if (ans[i] != 0)
			{
				key = 1;
			}
			if (key == 0)
			{
				continue;
			}
			System.out.print(ans[i]);
			tag = 1;
		}
		if (tag == 0)
		{
			System.out.print(0);
		}
	}
}

