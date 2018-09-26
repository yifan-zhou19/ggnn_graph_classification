package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b, String result)
	{
	 if (strcmp(a,b) == 0)
	 {
		 result[0] = '0';
		 result[1] = '\0';
		 return;
	 }
	 else
	 {
	 int la = a.length();
	 int lb = b.length();
	 int t = 0;
	 int c = 0;
	 int s;
	 char tmp;
	 while (la >= 0)
	 {
	  //cout<<"f function: a["<<la<<"]="<<a[la]<<",  b["<<lb<<"]="<<b[lb]<<endl;
	  if (lb < 0)
	  {
		  s = a[la--] - '0';
	  }
	  else
	  {
		  s = a[la--] - b[lb--];
	  }
	  result[t++] = s - c + '0';
	  if (result[t - 1].compareTo(48) < 0)
	  {
		  result[t - 1] += 10;
		  c = 1;
	  }
	  else
	  {
		  c = 0;
	  }
	 }
	 while (result[t - 1].equals('0'))
	 {
		 result[t - 1] = '\0';
		 t--;
	 }
	 int lresult = t - 1;
	 for (int i = 0;i <= lresult / 2;i++)
	 {
	  tmp = result[i];
	  result[i] = result[lresult - i];
	  result[lresult - i] = tmp;
	 }
	 result[lresult] = '\0';
	 }
	}
	public static int[] num = new int[100];
	public static int Main()
	{
	 String str = new String(new char[200]);
	 String str2 = new String(new char[200]);
	 String result = new String(new char[200]);
	 int i;
	 int j;
	 int k = 0;
	 str = new Scanner(System.in).nextLine();
	if (str.length() == 1 || (str.length() == 2) && str.charAt(0) == '1' && str.charAt(1) < '3')
	{
		System.out.print(0);
		System.out.print("\n");
		System.out.print(str);
	}
	else
	{
	 str2 = tangible.StringFunctions.changeCharacter(str2, 0, '1');
	 str2 = tangible.StringFunctions.changeCharacter(str2, 1, '3');
	 for (i = 2;i < str.length();i++)
	 {
	  str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
	 }
	 str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
	 while (str2.length() >= 2)
	 {
	  while (str.length() > str2.length() || (strcmp(str,str2) != -1 && str.length() == str2.length()))
	  {
	   num[k]++;
	   f(str, str2, result);
	   str = result;
	  }
	  k++;
	  str2 = tangible.StringFunctions.changeCharacter(str2, str2.length() - 1, '\0');
	 }
	 //cout<<"The result is:"<<endl;
	if (num[0] == 0)
	{
	 for (i = 1;i < k;i++)
	 {
	  System.out.print(num[i]);
	 }
	 System.out.print("\n");
	 System.out.print(str);
	}
	else
	{
		for (i = 0;i < k;i++)
		{
	  System.out.print(num[i]);
		}
	 System.out.print("\n");
	 System.out.print(str);
	}
	}

	 return 0;
	}

}

