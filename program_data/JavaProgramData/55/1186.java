package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i = 0;
		int j = 0;
		int[] n_number = new int[500];
		int decdec = 0;
		int[] a2 = new int[10];
		int k;
		int[] ans = new int[500];
		int l;
		int mi;
		double a;
		String n = new String(new char[500]);
		String ans2 = new String(new char[500]);
		String a1 = new String(new char[10]);
		a1 = tangible.StringFunctions.changeCharacter(a1, 1, 48);
		while ((a1[i] = System.in.read()) >= 48) //??a
		{
			i++;
		}
		a2[0] = a1.charAt(0) - 48;
		a2[1] = a1.charAt(1) - 48;
		if (a2[1] >= 0 && a2[1] <= 9)
		{
			a = a2[0] * 10 + a2[1];
		}
		else
		{
			a = a2[0];
		}
		i = 0;
		while ((n[i] = System.in.read()) >= 48)
		{
			i++; //??n
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i--;
		for (j = 0;j <= i;j++)
		{
			if (n.charAt(j) >= 48 && n.charAt(j) <= 57)
			{
				n_number[j] = n.charAt(j) - 48;
			}
			else if (n.charAt(j) >= 65 && n.charAt(j) <= 90)
			{
				n_number[j] = n.charAt(j) - 55;
			}
			else
			{
				n_number[j] = n.charAt(j) - 87;
			}
		}
		mi = i;
		for (l = 0;l <= i;l++)
		{
			decdec = decdec + n_number[l] * Math.pow(a,mi);
			mi = mi - 1;
		} //??????10??????
		if (decdec == 0)
		{
			System.out.print("0");
		}
		else
		{
		k = 0;
		while (decdec > 0)
		{
			ans[k] = decdec % b;
			decdec = decdec / b;
			k = k + 1;
		} //????????????b??????????
		k--;
		for (j = 0;j <= k;j++)
		{
			if (ans[j] >= 0 && ans[j] <= 9)
			{
				ans2 = tangible.StringFunctions.changeCharacter(ans2, j, ans[j] + 48);
			}
			if (ans[j] >= 10 && ans[j] <= 35)
			{
				ans2 = tangible.StringFunctions.changeCharacter(ans2, j, ans[j] + 55);
			}
		} //???????????????????11?35??
		for (j = k;j >= 0;j--)
		{
			System.out.print(ans2.charAt(j));
		} //??????
		}
		return 0;
	}
}

