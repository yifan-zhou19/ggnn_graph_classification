package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] res = new int[300];
		int ls;
		int lt;
		int i;
		int max;
		int[] s1 = new int[300];
		int[] t1 = new int[300];
		String s = new String(new char[300]);
		String t = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(res,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		{
			ls = s.length();
			lt = t.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(t1,0,(Integer.SIZE / Byte.SIZE));
			s1[0] = ls;
			for (i = 1;i <= ls;i++)
			{
				s1[i] = s.charAt(ls - i) - '0';
			}
			t1[0] = lt;
			for (i = 1;i <= lt;i++)
			{
				t1[i] = t.charAt(lt - i) - '0';
			}
			max = s1[0] > t1[0] != 0?s1[0]:t1[0];
			for (i = 1;i <= max;i++)
			{
				res[i] += s1[i] + t1[i];
				if (res[i] >= 10)
				{
					res[i + 1] += res[i] / 10;
					res[i] %= 10;
				}
				if (res[max + 1] != 0)
				{
					res[0] = max + 1;
				}
				else
				{
					res[0] = max;
				}
			}
	}
		for (i = res[0];res[i] == 0;i--)
		{
			;
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (;i >= 1;i--)
		{
			System.out.printf("%d",res[i]);
		}
		}

		System.out.print("\n");
		return 0;
	}
}

