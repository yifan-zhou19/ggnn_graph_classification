package <missing>;

public class GlobalMembers
{
	//?????0???
	public static void cutzeros(tangible.RefObject<String> a)
	{
		int i;
		int unzero = 0;
		int l = a.argValue.length();
		for (i = l - 1;i >= 0;i--)
		{
			if (a.argValue.charAt(i) != '0') //???????
			{
			//	printf("%d %d\n",i,a[i]);  //debug
				a.argValue.charAt(i + 1) = '\0';
				unzero = 1;
				break;
			}
		}
		if (unzero == 0) //??????
		{
			a.argValue.charAt(0) = '0';
			a.argValue.charAt(1) = '\0';
		}
	}
	//??????
	public static void reorder(tangible.RefObject<String> a)
	{
		int i;
		char c;
		int l = a.argValue.length();
		for (i = 0;i < l / 2;i++)
		{
			c = a.argValue.charAt(i);
			a.argValue.charAt(i) = a.argValue.charAt(l - 1 - i);
			a.argValue.charAt(l - 1 - i) = c;
		}
	}
	//????????
	public static String result = new String(new char[300]);
	public static void plus(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i;
		int la = a.argValue.length();
		int lb = b.argValue.length();
		int l;
		int r;
		int left = 0;
		if (la <= lb)
		{
			l = lb;
			for (i = la;i <= lb;i++)
			{
				a.argValue.charAt(i) = '0';
			}
			b.argValue.charAt(lb) = '0';
		}
		else
		{
			l = la;
			for (i = lb;i <= la;i++)
			{
				b.argValue.charAt(i) = '0';
			}
			a.argValue.charAt(la) = '0';
		}
		for (i = 0;i <= l;i++)
		{
			r = (a.argValue.charAt(i) - '0') + (b.argValue.charAt(i) - '0') + left;
			result = tangible.StringFunctions.changeCharacter(result, i, r % 10 + '0');
			left = r / 10; //??
		}
		result = tangible.StringFunctions.changeCharacter(result, l + 1, '\0'); //????
	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		reorder(tempRef_a);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		reorder(tempRef_b);
		b = tempRef_b.argValue;
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
		plus(tempRef_a2, tempRef_b2);
		b = tempRef_b2.argValue;
		a = tempRef_a2.argValue;
	tangible.RefObject<String> tempRef_result = new tangible.RefObject<String>(result);
		cutzeros(tempRef_result);
		result = tempRef_result.argValue;
	tangible.RefObject<String> tempRef_result2 = new tangible.RefObject<String>(result);
		reorder(tempRef_result2);
		result = tempRef_result2.argValue;
		System.out.printf("%s",result);
		return 0;
	}

}

