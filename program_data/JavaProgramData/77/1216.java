import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int num(String a)
	{
		int n = 0;
		for (int i = 0; !a[i].equals(0);i++)
		{
			n = i;
		}
		return n + 1;
	}
	public static int judge(String a)
	{
		int flag = 0;
		for (int i = 1;;i++)
		{
			if (!a[i].equals(a[i - 1])) //??????????????????????
			{
				flag = i;
				break;
			}
		}
		return flag;
	}
	public static int leave(int n, String a, char b, char g)
	{
		while (true)
		{
		int flag = -1; //flag??????0????flag1???????flag2??????
		int flag1;
		int flag2 = 0;
		for (int i = 0;i < n;i++) //??????????
		{
			if (a[i].equals(b) && a[i + 1].equals(g)) //????????????????0
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i + 1);
				System.out.print("\n");
				a[i] = null;
				a[i + 1] = null;
				flag1 = i;
				flag2 = i + 1;
				break;
			}
			else if (a[i].equals(b) && a[i + 1].equals(0)) //??????0???
			{
				flag = i;
			}
			else if (a[i].equals(g) && flag >= 0) //0??????????????????0
			{
				System.out.print(flag);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				a[i] = null;
				a[flag] = null;
				flag1 = flag;
				flag = -1;
				flag2 = i;
				break;
			}
		}
		if ((flag1 == 0) && (flag2 == (n - 1))) //?????????????????
		{
			break;
		}
		}
		return 0;
	}
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char boy;
		char girl;
		a = new Scanner(System.in).nextLine();
		int n;
		n = num(a);
		boy = a[0];
		girl = a[judge(a)];
		leave(n, a, boy, girl);


		return 0;
	}
}
