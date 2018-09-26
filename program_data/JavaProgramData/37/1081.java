package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int tas;
	int task;
	int n;
	int i;
	int[] mark = new int[100];
	int l;
	int flag;
	String s = new String(new char[10000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		task = Integer.parseInt(tempVar);
	}
	for (tas = 1;tas <= task;tas++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	flag = 0;
	l = s.length();
	for (i = 0;i <= 27;i++)
	{
	 mark[i] = 0;
	}
	for (i = 0;i < l;i++)
	{
	 mark[s.charAt(i) - 'a' + 1]++;
	}
	for (i = 0;i < l;i++)
	{
	 if (mark[s.charAt(i) - 'a' + 1] == 1)
	 {
		System.out.printf("%c\n",s.charAt(i));
		flag = 1;
		break;
	 }
	}
	if (flag == 0)
	{
		System.out.print("no\n");
	}
	}
	}
}

