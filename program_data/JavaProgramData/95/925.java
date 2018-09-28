import java.util.*;

int max = new int(int,int);
int main()
{
	int i;
	int n;
	int len1;
	int len2;
	String str1 = new String(new char[100]);
	String str2 = new String(new char[100]);
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	len1 = str1.length();
	len2 = str2.length();
	n = Math.max(len1,len2);
	for (i = 0; i < n; i++)
	{
		if (str1.charAt(i) >= 'a')
		{
			str1.charAt(i) -= 32;
		}
		if (str2.charAt(i) >= 'a')
		{
			str2.charAt(i) -= 32;
		}
		if ((str1.charAt(i) != str2.charAt(i)) && (Math.abs(str1.charAt(i) - str2.charAt(i)) != 32))
		{
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">");
				break;
			}
			if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print("<");
				break;
			}
		}
	}
	if (i == n)
	{
		System.out.print("=");
	}
	return 0;
}
int Math.max(int a,int b)
{
	if (a >= b)
	{
		return a;
	}
	if (a < b)
	{
		return b;
	}
}
