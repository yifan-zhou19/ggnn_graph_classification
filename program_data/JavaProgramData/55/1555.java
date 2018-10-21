package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int m;
	int n;
	int n1;
	int n2;
	int[] a = new int[1000];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int sum=0,t=1;
	int sum = 0;
	int t = 1;
	String s = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n2 = Integer.parseInt(tempVar3);
	}
	n = s.length();
	for (i = n - 1;i >= 0;i--)
	{
					   if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')
					   {
					   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A' + 10);
					   }
					   if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
					   {
					   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a' + 10);
					   }
					   if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
					   {
					   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
					   }
					   sum = sum + s.charAt(i) * t;
					   if (i == 0)
					   {
					   break;
					   }
					   t = t * n1;
	}
	if (sum == 0)
	{
	System.out.print("0");
	}
	else
	{
	i = 0;
	while (sum != 0)
	{
					k = sum % n2;
					a[i] = k;
					i++;
					sum = sum / n2;
	}
	i = i - 1;
	for (j = i;j >= 0;j--)
	{
					 if (a[j] >= 10)
					 {
					 System.out.printf("%c",a[j] + 'A' - 10);
					 }
					 else
					 {
					 System.out.printf("%d",a[j]);
					 }
	}
	}
	}

}

