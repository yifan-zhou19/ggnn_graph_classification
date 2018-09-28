import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String b = new String(new char[101]);
		int[] A = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s = null;
		int s = null;
		int[] B = new int[101];
		int i;
		a = new Scanner(System.in).nextLine();
		for (p = a, q = A; ;p++, q++)
		{
			if (*p == '\0')
			{
				break;
			}
			else
			{
				*q = p;
			}
		}
		for (i = 0, s = A; s < q - 1;i++, s++)
		{
			B[i] = s + *(s + 1);
			b = tangible.StringFunctions.changeCharacter(b, i, B[i]);
		}
		B[i] = A[0] + s;
		b = tangible.StringFunctions.changeCharacter(b, i, B[i]);
		for (p = b; p <= b.Substring(i); p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}


}

