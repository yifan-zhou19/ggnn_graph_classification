package <missing>;

public class GlobalMembers
{
	 //******************************//
	 //*     ?????				*//
	 //*     ???1000012711		*//
	 //*     ????????		*//
	 //*     ???2010.11.24		*//
	 //******************************// 
	public static int Main()
	{
		int[] t1 = new int[1000]; //?????? ???1000??  t1?t2?????
		int[] t2 = new int[1000];
		char a;
		int i; //g??? t??? num??? max?????????
		int g = 0;
		int t;
		int num;
		int max = 0;
		for (i = 0;;i++)
		{
			t1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read(); //????????
			if (a == ',') //???????g+1
			{
				g++;
			}
			if (a == '\n') //????break
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			t2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
			if (a == '\n')
			{
				break;
			}
		}
		for (t = 1; t <= 1000; t++) //???1????1000 ,?t??????????
		{
			num = 0;
			for (i = 0; i < g + 1; i++) //????
			{
				if (t >= t1[i] != 0 && t < t2[i]) //????t??????
				{
					num++; //??+1
					if (num > max) //????max ?max = num,??????
					{
						max = num;
					}
				}
			}
		}
		System.out.print(g + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

