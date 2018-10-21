package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int g;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (g = 0;g < n;g++)
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	String c = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(c,'0',(Character.SIZE / Byte.SIZE));
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	int l1;
	int l2;
	l1 = a.length();
	l2 = b.length();
	int l;
	if (l1 > l2)
	{
	  l = l1;
	}
	else
	{
		l = l2;
	}
	//printf("%d\n",l);
	   int i;
	   for (i = l;i > l - l1;i--)
	   {
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - (l - l1 + 1)));

	   }
	//printf("%c\n",a[l]);
	for (i = l;i > l - l2;i--)
	{
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - (l - l2 + 1)));
	}
	//printf("%c\n",b[l]);
	for (i = 0;i <= l - l1;i++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, '0');
	}
	//printf("%c\n",a[l-l1]);
	for (i = 0;i <= l - l2;i++)
	{
	b = tangible.StringFunctions.changeCharacter(b, i, '0');
	}
	//printf("%c\n",b[l-l2+1]);
	int flag = 0;
	for (i = l;i > 0;i--)
	{
		int sum = 0;
	  if (flag == 1)
	  {
	   sum = a.charAt(i) - b.charAt(i) - 1;
	  }
	  if (flag == 0)
	  {
	  sum = a.charAt(i) - b.charAt(i);
	  }
	  if (sum < 0)
	  {
			c = tangible.StringFunctions.changeCharacter(c, i, sum + '0' + 10);
			flag = 1;
	  }
	  else
	  {
		   c = tangible.StringFunctions.changeCharacter(c, i, sum + '0');
		   flag = 0;
	  }
	}
	 //printf("%c %c %c %c\n",c[l],c[3],c[2],c[1]);

	int flag1 = 0;
	//printf("%c\n",c[0]);
	int t;
	for (i = 0;i <= l;i++)
	{
					 if (c.charAt(i) != '0')
					 {
						  t = i;
						  break;
					 }

	}
					  for (i = t;i <= l;i++)
					  {
								   System.out.printf("%c",c.charAt(i));
					  }
								   System.out.print("\n");
	/*if(flag)
	{
	for(i=0;i<=l;i++)
	   printf("%c",c[i]);
	}
	else
	{for(i=1;i<=l;i++)
	printf("%c",c[i]);
	}*/



	}

	}

}

