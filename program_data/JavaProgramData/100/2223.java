package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int len;
	int i;
	int[] a = new int[60];
	String s = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	for (i = 0;i <= 60;i++)
	{
		a[i] = 0;
	}
	for (i = 0;i <= s.length();i++)
	{
	   if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
	   {
		   a[s.charAt(i) - 'A']++;
	   }
	   if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
	   {
		   a[s.charAt(i) - 'a' + 30]++;
	   }
	}
	len = 0;
	for (i = 0;i <= 60;i++)
	{
		len += a[i];
	//printf("%d\n",a[i]);
	}
	//printf("%d",len);
	for (i = 0;i <= 25;i++)
	{
		if (a[i] > 0)
		{
			System.out.printf("%c=%d\n",i + 'A',a[i]);
		}
	}
	for (i = 0;i <= 25;i++)
	{
		if (a[i + 30] > 0)
		{
			System.out.printf("%c=%d\n",i + 'a',a[i + 30]);
		}
	}
	if (len == 0)
	{
		System.out.print("No");
	}
	//scanf("%d",&i);
	}

}

