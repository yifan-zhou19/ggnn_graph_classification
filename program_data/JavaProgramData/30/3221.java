package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i = 1;
		int s = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			 if (((i % 7)) && (!(i % 10 == 7)) && (!(i / 10 == 7)))
			 {
			//if ((i%7)||(i%10-7)||(i/10-7)) {
											 s = s + i * i;
											// printf("%d\n",i);
			 }
											 i++;
		}

		System.out.printf("%d",s);
	}
}

