package <missing>;

public class GlobalMembers
{
	//---------------
	//   ?????
	//   2010/12/22
	//     ADE
	//---------------


	public static int get(int[] arr) //?????????????
	{
		int t = 0;
		int i = 0;
		char c;
		arr[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 i++;
		while ((c = System.in.read()) != '\n')
		{
			arr[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		return i; //?????
	}
	public static int Main()
	{
		int i; //max???????endtime??????
		int k;
		int[] s = new int[1000];
		int[] e = new int[1000];
		int[] time = new int[1000];
		int num;
		int max = 0;
		int endtime = 0;
		for (i = 0;i < 1000;i++)
		{
			s[i] = e[i] = time[i] = 0;
		}
		num = get(s);
		num = get(e);
		for (i = 0;i < num;i++)
		{
			if (endtime < e[i])
			{
				endtime = e[i]; //??????
			}
			for (k = s[i];k < e[i];k++) //?i?????????????+1
			{
				time[k]++;
			}
		}
		for (i = 0;i < endtime;i++)
		{
			if (max < time[i])
			{
				max = time[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}

