package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int[] judge = new int[200];
		char boy;
		char girl;
		int i;
		int j;
		int last;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		boy = a.charAt(0);
		last = 0;
		girl = a.charAt(a.length() - 1);
		while (num != (a.length() + 1) / 2)
		{
			i = 1;
			while (num != (a.length() + 1) / 2)
			{
			if (a.charAt(last + i) == boy && judge[last + i] == 0)
			{
				last++;
				break;
			}
			else if (a.charAt(last + i) == girl && judge[last + i] == 0)
			{
				System.out.printf("%d %d\n",last,last + i);
				judge[last] = 1;
				judge[last + i] = 1;
			while (judge[last] != 0)
			{
			last--;
			}
			num++;
			break;
			}
			else
			{
				i++;
			}
			}
		}
		return 0;
	}

}

