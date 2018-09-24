package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int lens;
		int lenw;
		int temp;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		lens = s.length();
		lenw = w.length();
		for (i = 0;i <= lenw - lens;i++)
		{
			temp = 1;
			for (j = i,k = 0;k <= lens - 1;j++,k++)
			{
				if (s.charAt(k) != w.charAt(j))
				{
					temp = 0;
					break;
				}
			}
			if (temp == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}


}

