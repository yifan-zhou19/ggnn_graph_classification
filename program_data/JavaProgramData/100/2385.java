package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
		int i;
		int k;
		int count;
		int[] num = new int[200];
		int fuck = 0;
		String a = new String(new char[1000]);
		String b = new String(new char[520]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < a.length();i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
				count = a.charAt(i);
				num[count]++;
			}
		}
		for (i = 0;i < 200;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",i,num[i]);
				fuck = 1;
			}

		}
			fuck == 0?System.out.print("No"):fuck;
	}


}

