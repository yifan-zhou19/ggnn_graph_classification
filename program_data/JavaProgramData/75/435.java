package <missing>;

public class GlobalMembers
{
	//*************************************************
	//* file: 1000012912_007.cpp                      *
	//* author : ???                               *
	//* date : 2010.11.24                             *
	//* function : ?????                         *
	//*************************************************
	public static int Main()
	{
		int i; //n????in??????out??????time???????
		int j;
		int n;
		int[] time = new int[1000];
		int max;
		int[] in = new int[1000];
		int[] out = new int[1000];
		String c = new String(new char[1000]);
		for (i = 0; c.charAt(i - 1) != '\n'; i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
		}
		n = i;
		for (i = 0; c.charAt(i - 1) != '\n'; i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
		}
		for (i = 0; i < n; i++)
		{
			for (j = in[i]; j < out[i] ; j++)
			{
				time[j]++; //???????1
			}
		}
		max = 0;
		for (i = 1; i < 1000; i++) //????????
		{
			if (time[max] < time[i])
			{
				max = i;
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(time[max]);
		System.out.print("\n");
		return 0;
	}

}

