class Palindrome2
{
    public String makePalindrome(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length() - 1;

        while (left < right)
        {
            if (sb.charAt(left) != sb.charAt(right))
            {
                char smallerChar = (char) Math.min(sb.charAt(left), sb.charAt(right));
                sb.setCharAt(left, smallerChar);
                sb.setCharAt(right, smallerChar);
            }
            left++;
            right--;
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        Palindrome2 sol = new Palindrome2();
        String str = "bhagya";
        System.out.println(sol.makePalindrome(str)); // Example output
    }
}