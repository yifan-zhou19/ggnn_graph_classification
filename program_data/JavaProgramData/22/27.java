package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int sec = -1;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			temp = Integer.parseInt(tempVar);
		}
		System.in.read();
		max = temp;
		while (scanf("%d", temp) != EOF)
		{
			System.in.read();
			//if(temp==0) break;
			if (temp > max)
			{
				sec = max;
				max = temp;
				continue;
			}
			else if (temp < max && temp >= sec)
			{
				sec = temp;
			}
		}
		if (sec == max || sec == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",sec);
		}


	}
}

