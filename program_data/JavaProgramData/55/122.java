package <missing>;

public class GlobalMembers
{
	//*******************************
	//*     ??:????           *
	//*     ??:??               *
	//*     ??:2007.12.2          *
	//*     ??:????           *
	//*******************************
	public static void Main()
	{
		int n; //????,??
		int jz1; //??
		int jz2;
		int wei1; //??(?????????-1,???????)
		int wei2;
		int i; //????
		int j;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //?????????
		String b = new String(new char[35]);
		char t; //??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			jz1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jz2 = Integer.parseInt(tempVar3);
		}
		if (a[0] == '0')
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;a[i] != 0;i++)
			{
				;
			}
		 wei1 = i - 1;
		for (i = 0;i <= wei1;i++)
		{
			if (a[i] >= 'a' && a[i] <= 'z')
			{
				a[i] -= 'a' - 10; //??????!!!!!!!!!!????!!!!!!!!!!!!!!!!!!!!??10???"-"
			}
			else if (a[i] >= 'A' && a[i] <= 'Z')
			{
				a[i] -= 'A' - 10;
			}
			else
			{
				a[i] -= '0';
			}
		}
		for (j = wei1,i = 0,n = 0;i <= wei1;i++,j--) //???n???????
		{
			n += Math.pow(jz1,j) * a[i]; //????warning,????
		}

		for (i = 0;n != 0;i++) //??,?????n=0????
		{
			b = tangible.StringFunctions.changeCharacter(b, i, n % jz2);
			n /= jz2;
		}
		wei2 = i - 1;
		for (i = 0;i <= wei2 / 2;i++)
		{
			t = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(wei2 - i));
			b = tangible.StringFunctions.changeCharacter(b, wei2 - i, t);
		}
		b = b.substring(0, wei2 + 1);
		for (i = 0;i <= wei2;i++)
		{
			if (b.charAt(i) >= 10)
			{
				b.charAt(i) += 'A' - 10;
			}
			else
			{
				b.charAt(i) += '0';
			}
		}
		System.out.println(b);
		}
	}
	//     ******
	//     * ? *
	//     ******




}

