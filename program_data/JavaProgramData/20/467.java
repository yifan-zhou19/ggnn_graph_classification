package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int maxnum;
	  int max;
	  int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p1;
	  String str1 = new String(new char[20]);
	  String str2 = new String(new char[20]);
	  String strcopy = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p3;
	  while (scanf("%s %s",str1,str2) != EOF)
	  {
		p1 = str1;
		p3 = strcopy;
		for (i = 0,max = 0;str1.charAt(i) != '\0';i++)
		{
		if (str1.charAt(i) > max)
		{
		 max = str1.charAt(i);
		 maxnum = i;
		}
		}
		strcopy = str1;
		*(p3 + maxnum + 1) = '\0';
		strcopy += str2;
		for (p1 = str1.charAt(maxnum + 1), p3 = strcopy.charAt(maxnum + 4); * p1 != '\0';p1++, p3++)
		{
			*p3 = p1;
		}
		n = str1.length();
		strcopy = tangible.StringFunctions.changeCharacter(strcopy, n + 3, '\0');
		System.out.println(strcopy);
	  }
	}
}

