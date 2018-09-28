package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] tz = new int[4];
		char xs1 = 'z';
		char xs2 = 'q';
		char xs3 = 's';
		char xs4 = 'l';
		tz[1] = 40;
		tz[3] = 50;
		tz[0] = 20;
		tz[2] = 10;
		System.out.printf("%c %d\n",xs4,tz[3]);
		System.out.printf("%c %d\n",xs2,tz[1]);
		System.out.printf("%c %d\n",xs1,tz[0]);
		System.out.printf("%c %d\n",xs3,tz[2]);
		return 0;
	}

}
