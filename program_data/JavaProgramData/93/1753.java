package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (fmod(x,3) == 0 && fmod(x,5) == 0 && fmod(x,7) == 0)
		{
			System.out.printf("%d %d %d\n",3,5,7);
		}
		if (fmod(x,3) == 0 && fmod(x,5) == 0 && fmod(x,7) != 0)
		{
			System.out.printf("%d %d\n",3,5);
		}
		if (fmod(x,5) == 0 && fmod(x,7) == 0 && fmod(x,3) != 0)
		{
			System.out.printf("%d %d\n",5,7);
		}
		if (fmod(x,3) == 0 && fmod(x,7) == 0 && fmod(x,5) != 0)
		{
			System.out.printf("%d %d\n",3,7);
		}
		if (fmod(x,3) == 0 && fmod(x,5) != 0 && fmod(x,7) != 0)
		{
			System.out.printf("%d\n",3);
		}
		if (fmod(x,3) != 0 && fmod(x,5) == 0 && fmod(x,7) != 0)
		{
			System.out.printf("%d\n",5);
		}
		if (fmod(x,3) != 0 && fmod(x,5) != 0 && fmod(x,7) == 0)
		{
			System.out.printf("%d\n",7);
		}
		if (fmod(x,3) != 0 && fmod(x,5) != 0 && fmod(x,7) != 0)
		{
			System.out.printf("%c\n",'n');
		}
	}
}

