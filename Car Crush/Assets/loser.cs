using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class loser : MonoBehaviour
{
    public AudioSource src;
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.tag == "Enemy")
        {
            src.Play();
            Invoke("Restart", 1f);
        }
    }
    void Restart()
    {
        SceneManager.LoadScene(0);
    }
}
