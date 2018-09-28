package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int j = 0;
		String p;
		String q;
		String a = new String(new char[30]);
		String c = new String(new char[30]);
		a = new Scanner(System.in).nextLine(); //????????
		b = a.length(); //????
		p = a;
		q = c;
		for (int i = 0;i < 30;i++) //???????????
		{
		*(q.Substring(i)) = ':';
		}
		for (int i = 0;i < b;i++)
		{
		  if (Character.isDigit(*(p.Substring(i))) != 0) //?????????
		  {
			*(q.Substring(j)) = *(p.Substring(i));
			j = j + 1;
		  }
		  if ((Character.isDigit(*(p.Substring(i))) != 0) && (i == b - 1)) //??????????????????
		  {
		  System.out.print(Integer.parseInt(c));
		  System.out.print("\n");
		  }
		  if (i > 0)
		  {
			if ((Character.isDigit(*(p.Substring(i))) == 0) && (Character.isDigit(*(p.Substring(i) - 1)) != 0)) //???????????????
			{
			  System.out.print(Integer.parseInt(c));
			  System.out.print("\n");
			  j = 0; //???????
			  for (int k = 0;k < 30;k++)
			  {
			  *(q.Substring(k)) = ':';
			  }
			}
		  }
		}
		return 0;
	}

}
