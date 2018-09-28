package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ?  ??????     *
	//*  ?  ??2010-10-27   *
	//*  ?  ?????       *
	//*************************
	public static int Main()
	{
		String n = new String(new char[100]); //???????
		int length; //?????????????????????
		int ten = 0;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		length = n.length(); //????
		for (i = 0;i <= length - 1;i++) //?????????????
		{
			if (('A' <= n.charAt(i)) && (n.charAt(i) <= 'Z')) //???????????ASCII????????
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
			}
			else if (('a' <= n.charAt(i)) && (n.charAt(i) <= 'z'))
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
			}
			else if (('0' <= n.charAt(i)) && (n.charAt(i) <= '9')) //?????????ASCII????????
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
			}
		}
		for (i = 0;i <= length - 1;i++)
		{
			ten = ten + (int)(n.charAt(i) * Math.pow(a,length - i - 1)); //?a????????
		}
		if (ten == 0)
		{
			System.out.printf("%d",ten); //??0????
		}
		if (ten != 0)
		{
			int[] yushu = new int[100]; //????
			int j;
			for (i = 0;ten != 0;i++)
			{
				yushu[i] = ten % b; //???????b???????
				ten = ten / b;
			}
			for (j = i - 1;j >= 0;j--) //??????b?????
			{
				if ((0 <= yushu[j]) && (yushu[j] <= 9))
				{
					System.out.printf("%d",yushu[j]); //???0-9?????
				}
				else if (yushu[j] >= 10)
				{
					yushu[j] = yushu[j] + 'A' - 10;
					System.out.printf("%c",yushu[j]); //???10????????????
				}
			}
		}
		System.out.print("\n");
		return 0;
	}


}

