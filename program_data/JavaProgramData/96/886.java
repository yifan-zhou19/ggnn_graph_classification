package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[101]);
	int[] answer = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(answer,0,(Integer.SIZE / Byte.SIZE));
	int p;
	int q;
	int flag = 0;
	int j;
	int i;
	int k;
	str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	i = 0;
	for (j = 0;j < str.length();j++)
	{
	   p = 0;
	   for (k = i;p < 13;k++)
	   {
			   if (k >= str.length())
			   {
			  break;
			   }
		   p = p * 10 + str.charAt(k) - '0'; //???????str???????????????13
	   }
	   j = k - 1; //????????????answer??????
	   answer[j] = p / 13;
	   p = p % 13;
	   q = p;
	   for (int k = j;k >= i;k--)
	   {
		  str = tangible.StringFunctions.changeCharacter(str, k, p % 10 + '0'); //??str?????????????????0??
		  p = p / 10;
		  if (p == 0 && str.charAt(k - 1) == '0')
		  {
			 i = k - 1;
			 break;
		  }
	   }
	}
	for (i = 0;i < j;i++)
	{
	   if (answer[i] != 0) //???0???????answer
	   {
		  flag = 1;
	   }
	   if (flag != 0)
	   {
		 System.out.print(answer[i]);
	   }
	}
	if (flag == 0)
	{
	   System.out.print(0);
	}
	System.out.print("\n");
	System.out.print(q);
	System.out.print("\n");
	return 0;
	}
}

